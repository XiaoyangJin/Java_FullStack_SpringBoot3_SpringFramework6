import { createContext, useContext, useState } from "react";
import { apiClient } from "../api/ApiClient";
import { executeBasicAuthenticationService } from "../api/HelloWorldApiService";

//1: Create a Context
export const AuthContext = createContext()

export const useAuth = () => useContext(AuthContext)


//2: Share the created context with other component

export default function AuthProvider({ children }) {

    //3: Put some state in the context
    const [isAuthenticated, setAuthenticated] = useState(false)

    const [username, setUsername] = useState(null)

    const [token, setToken] = useState(null)

    // function login(username, password) {
    //     if (username === 'XY' && password === '12345') {
    //         setAuthenticated(true)
    //         setUsername(username)
    //         return true
    //     } else {
    //         setAuthenticated(false)
    //         setUsername(null)
    //         return false
    //     }
    // }

    async function login(username, password) {

        const basicToken = 'Basic ' + window.btoa(username + ":" + password)

        try {
            // this is a promise
            const response = await executeBasicAuthenticationService(basicToken)

            if (response.status == 200) {
                setAuthenticated(true)
                setUsername(username)
                setToken(basicToken)
                apiClient.interceptors.request.use(
                    (config) => {
                        console.log('intercepting and adding a token')
                        config.headers.Authorization = basicToken
                        return config
                    }
                )
                return true
            } else {
                logout()
                return false
            }
        } catch (error) {
            logout()
            return false
        }
    }

    function logout() {
        setAuthenticated(false)
        setUsername(null)
        setToken(null)
    }

    return (
        <AuthContext.Provider value={{ isAuthenticated, login, logout, username, token }}>
            {children}
        </AuthContext.Provider>
    )
}
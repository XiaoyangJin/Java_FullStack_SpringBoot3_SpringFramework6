import { createContext, useContext, useState } from "react";
import { executeBasicAuthenticationService } from "../api/HelloWorldApiService";

//1: Create a Context
export const AuthContext = createContext()

export const useAuth = () => useContext(AuthContext)


//2: Share the created context with other component

export default function AuthProvider({ children }) {

    //3: Put some state in the context
    const [isAuthenticated, setAuthenticated] = useState(false)

    const [username, setUsername] = useState(null)

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
                return true
            } else {
                setAuthenticated(false)
                setUsername(null)
                return false
            }
        } catch (error) {
            setAuthenticated(false)
            setUsername(null)
            return false
        }
    }

    function logout() {
        setAuthenticated(false)
    }

    return (
        <AuthContext.Provider value={{ isAuthenticated, login, logout, username }}>
            {children}
        </AuthContext.Provider>
    )
}
import { createContext, useContext, useState } from "react";

//1: Create a Context
export const AuthContext = createContext()

export const useAuth = () => useContext(AuthContext)


//2: Share the created context with other component

export default function AuthProvider({ children }) {

    //3: Put some state in the context
    const [number, setNumber] = useState(10)

    const [isAuthenticated, setAuthenticated] = useState(false)

    // setInterval(() => setNumber(number + 1), 10000)

    function login(username, password) {
        if (username === 'XY' && password === '12345') {
            setAuthenticated(true)
            return true
        } else {
            setAuthenticated(false)
            return false
        }
    }

    function logout() {
        setAuthenticated(false)
    }


    return (
        <AuthContext.Provider value={{ number, isAuthenticated, setAuthenticated, login, logout }}>
            {children}
        </AuthContext.Provider>
    )
}
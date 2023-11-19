import { createContext, useState } from "react";

//1: Create a Context
export const AuthContext = createContext()

//3: Put some state in the context

//2: Share the created context with other component

export default function AuthProvider({ children }) {

    const [number, setNumber] = useState(0)

    return (
        <AuthContext.Provider value={{ number }}>
            {children}
        </AuthContext.Provider>
    )
}
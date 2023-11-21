import { useParams, Link } from 'react-router-dom'

export default function WelcomeComponent() {

    const { username } = useParams()

    function callHelloWorldApi() {

    }

    return (
        <div className="WelcomeComponent">
            <h1>Welcome {username}!</h1>
            <div>
                Manage your todos - <Link to="/todos">Go here</Link>
            </div>
            <div>
                <button class="btn btn-success" onClick={callHelloWorldApi}>Call Hello World REST API</button>
            </div>
        </div>
    )
}
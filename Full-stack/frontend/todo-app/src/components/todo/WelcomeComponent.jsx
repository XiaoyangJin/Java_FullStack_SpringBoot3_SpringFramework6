import { useParams, Link } from 'react-router-dom'

export default function WelcomeComponent() {

    const { username } = useParams()

    function callHelloWorldApi() {
        console.log('called')
    }

    return (
        <div className="WelcomeComponent">
            <h1>Welcome {username}!</h1>
            <div>
                Manage your todos - <Link to="/todos">Go here</Link>
            </div>
            <div>
                <button className="btn btn-success m-5" onClick={callHelloWorldApi}>Call Hello World</button>
            </div>
        </div>
    )
}
const person = {
    name: 'Summer',
    address: '123 Baker Street, London'
}

export default function LearningJavaScript() {
    return (
        <div>
            <div>{person.name}</div>
            <div>{person.address}</div>
        </div>
    );
}
const person = {
    name: 'Summer',
    address: {
        line1: 'Baker Street',
        city: 'London',
        contry: 'UK',
    },
    profiles: ['twitter', 'LinkedIn', 'ins']
}

export default function LearningJavaScript() {
    return (
        <div>
            <div>{person.name}</div>
            <div>{person.address.city}</div>
            <div>{person.profiles[0]}</div>

        </div>
    );
}
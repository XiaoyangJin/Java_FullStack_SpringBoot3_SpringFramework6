import { useState } from 'react'
import { PropTypes } from 'prop-types'
import './Counter.css'

export default function Counter() {

    const [count, setCount] = useState(0);

    function incrementCounterParentFunction(by) {
        setCount(count + by)
    }

    function someMethodInParent() {
        console.log("parent method called")
    }

    return (
        <div>
            <span className="totalCount">{count}</span>
            <CounterButton by={1} someMethodInParent={someMethodInParent} />
            <CounterButton by={3} someMethodInParent={someMethodInParent} />
            <CounterButton by={5} someMethodInParent={someMethodInParent} />
        </div>
    )
}

function CounterButton({ by, someMethodInParent }) {

    // array
    const [count, setCount] = useState(0);

    function incrementCounterFunction() {
        someMethodInParent();
        setCount(count + by)
    }

    function decrementCounterFunction() {
        setCount(count - by)
    }

    return (
        <div className="Counter">
            <span className="count">{count}</span>
            <div>
                <button className="counterButton"
                    onClick={incrementCounterFunction}
                >+{by}</button>
                <button className="counterButton"
                    onClick={decrementCounterFunction}
                >-{by}</button>
            </div>

        </div>
    )
}

CounterButton.propTypes = {
    by: PropTypes.number
}

CounterButton.defaultProps = {
    by: 1
}
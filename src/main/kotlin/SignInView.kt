import csstype.*
import react.FC
import react.Props
import emotion.react.css
import kotlinx.browser.window
import react.create
import react.dom.aria.ariaDescribedBy
import react.dom.html.InputType
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.span
import react.useState

external interface SignInViewProps : Props{}

val SignInView = FC<SignInViewProps> { props ->
    var email by useState<String>()
    var password by useState<String>()

    fun handleClear() {
        email = ""
        password = ""
    }

    fun submit() {
        window.alert("Welcome")
    }

    div {
        className = ClassName("sign-in-view")

        div {
            className = ClassName("form-title")

            p {
                + "Welcome to"
            }

            p {
                + "Mentoria Kt/Js"
            }
        }

        div {
            className = ClassName("form-div")

            input {
                className = ClassName("default-input form-control")
                type = InputType.email
                value = email
                placeholder = "Email"
                onChange = { event ->
                    email = event.target.value
                }
            }

            input {
                className = ClassName("default-input form-control")
                type = InputType.password
                value = password
                placeholder = "Password"
                onChange = { event ->
                    password = event.target.value
                }
            }

            div {
                className = ClassName("action-buttons-div")

                button {
                    onClick = {
                        handleClear()
                    }
                    className = ClassName("submit-btn btn btn-danger")
                    + "Clear"
                }

                button {
                    onClick = {
                        submit()
                    }
                    className = ClassName("submit-btn btn btn-dark")
                    + "Sign in"
                }
            }
        }
    }

}
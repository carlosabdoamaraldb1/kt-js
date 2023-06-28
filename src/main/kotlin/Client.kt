import kotlinx.browser.document
import kotlinx.js.jso
import react.create
import react.createElement
import react.dom.client.createRoot
import react.router.Route
import react.router.RouteProps
import react.router.Routes
import react.router.dom.BrowserRouter
import react.router.dom.HashRouter
import react.router.generatePath
import react.useState

fun main() {
    val container = document.createElement("div")
    document.body!!.appendChild(container)

    createRoot(container).render(SignInView.create())
}
import React from "react";
import { BrowserRouter,Route,Routes} from "react-router-dom";

import Login from "./pages/Login/Login";
import Book from "./pages/Book/Book";
import NewBook from "./pages/NewBook/NewBook";

export default function Rotas() {
    return (
        <BrowserRouter>
        <Routes>
            <Route path="/" Component={Login}/>
            <Route path="/book" Component={Book}/>
            <Route path="/book/new" Component={NewBook}/>
        </Routes>
        </BrowserRouter>
    )
}
import React from 'react';
import {Route, Routes} from "react-router-dom";
import {Container} from "react-bootstrap";
import mainPage from "./pages/mainPage";

const DevBucketApp = () => {
    return (
        <>
            <Container>
                <Routes>
                    <Route path='/home' Component={mainPage}></Route>
                </Routes>
            </Container>
        </>
    );
};

export default DevBucketApp;
import {Router, Switch, Route} from 'react-router-dom';
import Navbar from './core/components/Navbar';
import Home from './pages/Home';
import history from './core/utils/history'


const Routes = () => (
    <Router history={history}>
        <Navbar />
            <Switch>
                <Route path="/" exact>
                    <Home />
                </Route>
            </Switch>
    </Router>
);

export default Routes;
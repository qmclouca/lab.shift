import {  useState } from 'react';
import { Link, NavLink } from 'react-router-dom';
import './styles.scss';
import menu from '../../assets/images/MenuMobile.svg';

const Navbar = () => {
    const [drawerActive, setDrawerActive] = useState(false);
   
    return (
        <nav className="bg-primary main-nav">
            <Link to="/" className="nav-logo-text">
                <h4>Shift - Rodolfo Bortoluzzi</h4>
            </Link>
            <button className="menu-mobile-btn" type="button" onClick={() => setDrawerActive(!drawerActive)}>
                <img src={menu} alt="Mobile Menu" />
            </button>
            
            <div className={ drawerActive ? "menu-mobile-container" : "menu-container"}>
                <ul className="main-menu">
                    <li>
                        <NavLink to="/" exact className="nav-link" onClick={() => setDrawerActive(false)}>
                            HOME
                        </NavLink>
                    </li>
                </ul>
            </div>
        </nav>
    )
}

export default Navbar;
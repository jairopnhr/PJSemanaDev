import icon from '../../assets/img/IMG.svg'
import './style.css'
function Header()
{
    return (
        <header>
        <div className="dsmeta-logo-container">

                <img src={icon} alt="Header" />
                <h1>DsMeta</h1>
                <p>
                Um projeto da semana dev

                </p>
        </div>
        </header>
    )
}



export default Header;
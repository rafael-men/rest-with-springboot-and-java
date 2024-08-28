import React from 'react'
import './style.css'
import Logo from '../../assets/final_logo.png'
import { Link } from 'react-router-dom'
import { FiPower , FiEdit , FiTrash2} from 'react-icons/fi'

const Book = () => {
  return (
    <div className='book-container'>
        <header>
            <img src={Logo} alt='log'/>
            <span>Welcome <strong>Rafael</strong>!</span>
            <Link className='button' to='/book/new'>Add a new Book</Link>
            <button type='button'>
                <FiPower size={18} color='black'/>
            </button>
        </header>
        <h1>Livros Registrados</h1>
        <ul>
          <li>
            <strong>
              Title:
            </strong>
            <strong>
              Author:
            </strong>
            <strong>
              Price:
            </strong>
            <strong>
              Release Date:
            </strong>
            <button type='button'>
              <FiEdit size={20} color='#251FC5'/>
            </button>
            <button type='button'>
              <FiTrash2 size={20} color='#251FC5'/>
            </button>
          </li>
          <li>
            <strong>
              Title:
            </strong>
            <strong>
              Author:
            </strong>
            <strong>
              Price:
            </strong>
            <strong>
              Release Date:
            </strong>
            <button type='button'>
              <FiEdit size={20} color='#251FC5'/>
            </button>
            <button type='button'>
              <FiTrash2 size={20} color='#251FC5'/>
            </button>
          </li>
          <li>
            <strong>
              Title:
            </strong>
            <strong>
              Author:
            </strong>
            <strong>
              Price:
            </strong>
            <strong>
              Release Date:
            </strong>
            <button type='button'>
              <FiEdit size={20} color='#251FC5'/>
            </button>
            <button type='button'>
              <FiTrash2 size={20} color='#251FC5'/>
            </button>
          </li>
          <li>
            <strong>
              Title:
            </strong>
            <strong>
              Author:
            </strong>
            <strong>
              Price:
            </strong>
            <strong>
              Release Date:
            </strong>
            <button type='button'>
              <FiEdit size={20} color='#251FC5'/>
            </button>
            <button type='button'>
              <FiTrash2 size={20} color='#251FC5'/>
            </button>
          </li>
          <li>
            <strong>
              Title:
            </strong>
            <strong>
              Author:
            </strong>
            <strong>
              Price:
            </strong>
            <strong>
              Release Date:
            </strong>
            <button type='button'>
              <FiEdit size={20} color='#251FC5'/>
            </button>
            <button type='button'>
              <FiTrash2 size={20} color='#251FC5'/>
            </button>
          </li>
        </ul>
    </div>
  )
}

export default Book
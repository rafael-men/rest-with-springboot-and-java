import React from 'react'
import './style.css'
import Logo from '../../assets/final_logo.png'
import { Link } from 'react-router-dom'
import { FiPower } from 'react-icons/fi'

const Book = () => {
  return (
    <div className='book-container'>
        <header>
            <img src={Logo} alt='log'/>
            <span>Welcome <strong>Rafael</strong>!</span>
            <Link className='button' to='book/new'>Add a new Book</Link>
            <button type='button'>
                <FiPower size={18} color='black'/>
            </button>
        </header>
    </div>
  )
}

export default Book
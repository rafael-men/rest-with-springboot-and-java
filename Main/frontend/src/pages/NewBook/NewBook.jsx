import React from 'react'
import logo from '../../assets/final_logo.png'
import { Link } from 'react-router-dom'
import { FiArrowLeft } from 'react-icons/fi'
import './styles.css'


const NewBook = () => {
  return (
    <div className="new-book-container">
        <div className="content">
            <section className="form">
            <img src={logo} alt='login'/>
            <h1>Add a new book</h1>
            <Link className='back-link' to='/book'>
            <FiArrowLeft size={16} color='#251fc5'/>
            Home
            </Link>
            </section>
            <form action="">
                <input placeholder='Title' />
                <input placeholder='Author '/>
                <input type="date" />
                <input placeholder='Price'/>

                <button className='button' type='submit'>Add</button>
            </form>
        </div>
    </div>
  )
}

export default NewBook
import React, { useState } from 'react'
import logo from '../../assets/final_logo.png'
import {useNavigate} from 'react-router-dom'
import api from '../../services/api'
import { Link } from 'react-router-dom'
import { FiArrowLeft } from 'react-icons/fi'
import './styles.css'


const NewBook = () => {


  const [id,setId] = useState(null)
  const [author,setAuthor] = useState('')
  const [launchDate,setLaunchDate] = useState('')
  const [price,setPrice] = useState('')
  const [title,setTitle] = useState('')

  localStorage.getItem('username');
  localStorage.getItem('accessToken');

  const navigate = useNavigate();

  async function createNewBook(e) {
    e.preventDefault();
    const data = {
      title,author,launchDate,price
    }
    try {
      
    } catch (error) {
      alert('Error While Recording Book')
    }
  }

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
            <form onSubmit={createNewBook}>
                <input placeholder='Title' value={title} onChange={e => setTitle(e.target.value)}/>
                <input placeholder='Author ' value={author}  onChange={e => setAuthor(e.target.value)}/>
                <input type="date" value={launchDate}  onChange={e => setLaunchDate(e.target.value)}/>
                <input placeholder='Price' value={price}  onChange={e => setPrice(e.target.value)}/>

                <button className='button' type='submit'>Add</button>
            </form>
        </div>
    </div>
  )
}

export default NewBook
import React from 'react'
import './index.css'
import logo from '../../assets/final_logo.png'
const Login = () => {
  return (
    <div className='login-container'>
      <section className="form">
        <img src={logo} alt='login'/>
        <form action="">
          <h1>Access your account</h1>
          <input placeholder='Username' />
          <input type="password" placeholder='Password'/>
          <button className='button' type='submit'>Login</button>
        </form>
      </section>
    </div>
  )
}

export default Login
import React,{useState} from 'react'
import {useNavigate} from 'react-router-dom'
import './index.css'
import logo from '../../assets/final_logo.png'
import api from '../../services/api'

const Login = () => {

  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  const navigate = useNavigate();

  async function login(e) {
    e.preventDefault();
    const data = {
      username,
      password,
    };

    try {
      const response = await api.post('auth/signin', data);
      localStorage.setItem('username', username);
      localStorage.setItem('accessToken', response.data.token);

      navigate('/book');
    } catch (err) {
      alert('Login Failed');
    }
  }

  return (
    <div className='login-container'>
      <section className="form">
        <img src={logo} alt='login'/>
        <form action="" onSubmit={login}>
          <h1>Access your account</h1>
          <input placeholder='Username' value={username} onChange={e=>setUsername(e.target.value)} />
          <input type="password" placeholder='Password' value={password} onChange={e=>setPassword(e.target.value)}/>
          <button className='button' type='submit'>Login</button>
        </form>
      </section>
    </div>
  )
}

export default Login
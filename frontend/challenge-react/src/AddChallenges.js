// import axios from "axios";
// import { useState } from "react"

// export default function AddChallenges({onChallengeAdded}){

//     const[month , SetMonth ] = useState('');
//     const[discription , SetDiscription ] = useState('');

//     const handleSubmit = async (e)=>{
//         e.preventDefault();
//         try {
//             await axios.post('http://localhost:8080/challenges', {month,discription});
//             SetMonth('');
//             SetDiscription('');
//             onChallengeAdded();
//         } catch (error) {
//             console.error("Error Adding the challenge",error);
//         }

//     };

//     return(
//         <div className="card my-5">
//             <div className="card-header">
//                 Add New Challenges
//             </div>
//             <div className="card-body">
//             <form onSubmit={handleSubmit}>
//                 <div className="mb-3">
//                     <label htmlFor="month" className="form-label">Month: </label>
//                     <input type="text" value={month} className="form-control" placeholder="Enter the month" onChange={(e)=>{SetMonth(e.target.value)}}></input>
//                 </div>
//                 <div className="mb-3">
//                     <label htmlFor="description" classNmae="form-label" >Description: </label>
//                     <textarea value={discription} className="form-control"  placeholder="Describe the challenge"  onChange={(e)=>{SetDiscription(e.target.value)}}></textarea> 
//                 </div>
//                 <button type='submit' className='btn btn-primary'>Submit</button>
//             </form>
//             </div>
//         </div>
//     )
// }

import axios from 'axios';
import { useState } from 'react';

export default function AddChallenges({ onChallengeAdded }) {
  const [month, SetMonth] = useState('');
  const [description, SetDescription] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.post('http://localhost:8080/challenges', { month, description });
      SetMonth('');
      SetDescription('');
      onChallengeAdded();
    } catch (error) {
      console.error('Error Adding the challenge', error);
    }
  };

  return (
    <div className="card my-4 shadow">
      <div className="card-header bg-primary text-white">Add New Challenge</div>
      <div className="card-body">
        <form onSubmit={handleSubmit}>
          <div className="mb-3">
            <label htmlFor="month" className="form-label">Month:</label>
            <input type="text" value={month} className="form-control" placeholder="Enter the month" onChange={(e) => SetMonth(e.target.value)} />
          </div>
          <div className="mb-3">
            <label htmlFor="description" className="form-label">Description:</label>
            <textarea value={description} className="form-control" placeholder="Describe the challenge" onChange={(e) => SetDescription(e.target.value)}></textarea>
          </div>
          <button type='submit' className='btn btn-success'>Submit</button>
        </form>
      </div>
    </div>
  );
}
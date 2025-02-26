// import './App.css';
// import { useEffect, useState } from 'react';
// import ChallengeList from './ChallengeList';
// import axios from 'axios';
// import AddChallenges from './AddChallenges';
// import 'bootstrap/dist/css/bootstrap.min.css';

// function App() {


//   const[ Challenges , setChallenges] = useState([

//   ]);


//   useEffect(()=>{ 
//     fetchChallenges();
//   },[]);
 
//   const fetchChallenges = async()=>{
//     const response = await axios.get('http://localhost:8080/challenges');
//     console.log(response.data);
//     setChallenges(response.data);
//   };

//   const handleChallengesAdded = ()=>{
//     fetchChallenges();
//   };//callback to fetch challnege and disply in form

//   return (
//     <div class="container mt-5">
//       <h2 className='text-center mb-4'>Monthly Challenges</h2>
//       <AddChallenges onChallengeAdded={handleChallengesAdded}/>
//       <ChallengeList Challenges={Challenges}/>
//     </div>
//   );
// }

// export default App;



import './App.css';
import { useEffect, useState } from 'react';
import ChallengeList from './ChallengeList';
import axios from 'axios';
import AddChallenges from './AddChallenges';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  const [Challenges, setChallenges] = useState([]);

  useEffect(() => {
    fetchChallenges();
  }, []);

  const fetchChallenges = async () => {
    try {
      const response = await axios.get('http://localhost:8080/challenges');
      setChallenges(response.data);
    } catch (error) {
      console.error('Error fetching challenges', error);
    }
  };

  const handleChallengesAdded = () => {
    fetchChallenges();
  };

  return (
    <div className="container mt-5">
      <div className="card shadow-lg p-4 rounded">
        <h2 className='text-center mb-4 text-primary'>Monthly Challenges</h2>
        <AddChallenges onChallengeAdded={handleChallengesAdded} />
        <ChallengeList Challenges={Challenges} />
      </div>
    </div>
  );
}

export default App;
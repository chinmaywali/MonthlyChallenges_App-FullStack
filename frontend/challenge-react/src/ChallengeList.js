// import Challenge from './Challenge';

// export default function ChallengeList({Challenges}){

//     return(
//         <div className="list-group">
//             {Challenges.map(ch=>(
//                 <div>
//                     <Challenge key={ch.id} Challenges={ch}/>
//                 </div>
//             ))}
//         </div>
//     );
// }

import Challenge from './Challenge';

export default function ChallengeList({ Challenges }) {
  return (
    <div className="list-group mt-3">
      {Challenges.map(ch => (
        <Challenge key={ch.id} Challenges={ch} />
      ))}
    </div>
  );
}
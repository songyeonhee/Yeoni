function ProfileCard({ name, age, job, image }) {
  return (
    <div>
      <div>
        <img src={image} />
        <h3>{name}</h3>
        <p>{age}세</p>
        <p>{job}</p>
      </div>
    </div>
  );
}
export default ProfileCard;

import bcrypt

# Check known bcrypt hash from database
hash_from_db = b"$2b$12$S0InFudS5ENpPE.vdhp0/uLmRE8WMsGpL/qxblUgzixOrYsfQj81O"
print('matches password:', bcrypt.checkpw(b'password', hash_from_db))

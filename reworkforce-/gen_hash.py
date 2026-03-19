import bcrypt

pw = b"RevWorkforce123!"
h = bcrypt.hashpw(pw, bcrypt.gensalt(rounds=12))
print(h.decode())

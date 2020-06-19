# vault-demo

## For setting up vault locally in docker container:
 		
1. set up and run vault in a container:
        `docker run -d -p 8200:8200 --name vault -e "VAULT_DEV_ROOT_TOKEN_ID=mytoken" -e "VAULT_DEV_LISTEN_ADDRESS=0.0.0.0:8200" vault`
 		
2. Step in vault running in a container:
 		`docker exec -it vault sh`
 		
3. Set up localhost:8200 as VAULT_ADDR
 		`export VAULT_ADDR="http://localhost:8200"`
 		
4. Log in vault with the token had been set up in the first step:
 		`vault login mytoken`
 		
 5. Put some secret in the vault:
 		`vault kv put secret/vault user="vaultUser"`

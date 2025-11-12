# Keycloak 26.1.0 기반 이미지
FROM quay.io/keycloak/keycloak:26.1.0

# Realm JSON 복사
COPY realms /opt/keycloak/data/import

# 개발 모드 + Realm 자동 import 실행
CMD ["start-dev", "--import-realm"]

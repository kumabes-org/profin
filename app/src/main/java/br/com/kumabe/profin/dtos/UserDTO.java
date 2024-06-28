package br.com.kumabe.profin.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record UserDTO(Long id,
                      String name,
                      String email,
                      String username,
                      String password,
                      @JsonProperty("account_non_expired")
                      Boolean accountNonExpired,
                      @JsonProperty("account_non_locked")
                      Boolean accountNonLocked,
                      @JsonProperty("credentials_non_expired")
                      Boolean credentialsNonExpired,
                      Boolean enabled) {
}

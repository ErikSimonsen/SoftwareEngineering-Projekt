package de.dvdrental.resources.proxies;

import de.dvdrental.entities.Actor;
import io.quarkus.runtime.annotations.RegisterForReflection;

import javax.json.bind.annotation.JsonbProperty;
import java.net.URI;

@RegisterForReflection
public class FilmActorsProxy {
    @JsonbProperty("firstname-lastname")
    private String fullName;
    private URI href;

    public FilmActorsProxy() {
    }

    public FilmActorsProxy(Actor actor, URI href) {
        fullName = actor.getFirstName() + " " + actor.getLastName();
        this.href = href;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public URI getHref() {
        return href;
    }

    public void setHref(URI href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "FilmActorsProxy{" +
                "fullName='" + fullName + '\'' +
                ", href=" + href +
                '}';
    }
}

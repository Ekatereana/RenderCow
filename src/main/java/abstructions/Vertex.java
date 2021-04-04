package abstructions;

import abstructions.ObjectComponent;
import geometry.Vector3;

public class Vertex extends ObjectComponent {

    public Vector3 geometry;
    public Vector3 normal;

    public Vertex(Vector3 geometry, Vector3 normal) {
        this.geometry = geometry;
        this.normal = normal;
    }
}

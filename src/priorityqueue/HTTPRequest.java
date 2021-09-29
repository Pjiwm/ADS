package priorityqueue;

public class HTTPRequest implements Comparable<HTTPRequest> {
    private int qos;
    private String body;

    public HTTPRequest(int qos, String body) {
        this.qos = qos;
        this.body = body;
    }

    public int getQos() {
        return this.qos;
    }

    public void setQos(int qos) {
        this.qos = qos;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public int compareTo(HTTPRequest o) {
        return this.qos - o.qos;
    }

    @Override
    public String toString() {
        return "{" + " qos='" + getQos() + "'" + ", body='" + getBody() + "'" + "at='" + this.hashCode() + "' }";
    }
}
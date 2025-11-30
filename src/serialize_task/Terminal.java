package serialize_task;

import java.io.Serializable;

public class Terminal implements Serializable {
    final private String[] parameters;

    public Terminal(String[] args) {
        this.parameters = args;
    }

    public int getParameterCount() {
        return this.parameters.length;
    }

    public String[] getParameters() {
        return parameters;
    }

    public String getParameter(int index) {
        if (index >= 0 && index < this.parameters.length) {
            return parameters[index];
        }
        return null;
    }

    public boolean hasParameters() {
        return parameters.length > 0;
    }

    @Override
    public String toString() {
        if (!hasParameters()) return "Параметры не переданы.";

        StringBuilder res = new StringBuilder("Количество параметров: " + this.parameters.length + "\n"
                + "Список параметров:\n");

        for (int i = 0; i < this.parameters.length; i++) {
            res.append((i + 1)).append(". ").append(parameters[i]).append("\n");
        }

        return res.toString();
    }

    public boolean containsParameter(String searchParam) {
        for (String param : parameters) {
            if (param.equals(searchParam)) {
                return true;
            }
        }
        return false;
    }
}

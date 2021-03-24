package models.electronics;

public class Screen {
        //розмір екрану
    private String rime_Size;
        //рьоздільна здатність
    private  String Resolution;
    //матричне покритя
    private String Matrix_coating;

    public Screen(String rime_Size, String resolution, String matrix_coating) {
        this.rime_Size = rime_Size;
        Resolution = resolution;
        Matrix_coating = matrix_coating;
    }

    public String getRime_Size() {
        return rime_Size;
    }

    public void setRime_Size(String rime_Size) {
        this.rime_Size = rime_Size;
    }

    public String getResolution() {
        return Resolution;
    }

    public void setResolution(String resolution) {
        Resolution = resolution;
    }

    public String getMatrix_coating() {
        return Matrix_coating;
    }

    public void setMatrix_coating(String matrix_coating) {
        Matrix_coating = matrix_coating;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "rime_Size='" + rime_Size + '\'' +
                ", Resolution='" + Resolution + '\'' +
                ", Matrix_coating='" + Matrix_coating + '\'' +
                '}' + "\n";
    }
}

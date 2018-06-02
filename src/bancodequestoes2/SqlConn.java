package bancodequestoes2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
/**
 *
 * @author jackson
 */
public class SqlConn {
    private static Connection connection = null;
    
    public static Connection getConnection() {
        return connection;
    }

    public static void setConnection(Connection aConnection) {
        connection = aConnection;
    }
    
    public static void abrirConexão() throws Exception {
        String driverName = "com.mysql.jdbc.Driver";
        String serverName = "localhost";
        String dataBase = "provadb";
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://" + serverName + "/" + dataBase;
        // Registrar o driver
        Class.forName(driverName);
        // Capturar a conexão
        Connection conn = DriverManager.getConnection(url, user, pass);
        // Retorna a conexao aberta
        System.out.println("Conexão Iniciada");
        setConnection(conn);
    }
    
    public static void fecharConexão(Connection conn) throws Exception{
        try{
            getConnection().close();
            System.out.println("Conexao Fechada");
        }catch(SQLException e){
            System.out.println("erro ao fechar conexao");
        }
    }
    
    public static void reiniciar() throws Exception{
        fecharConexão(getConnection());
        System.out.println("Preparando para reiniciar conexão");
        
        SqlConn.abrirConexão();
        System.out.println("Conexão Reiniciada");
    }
    
    private static void setEmQuestoes(String enunciado, String tipo, String tema){
        
        String sql = "INSERT INTO questoes(enunciado, tipo, tema, fk_disciplina) VALUES(?, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = SqlConn.getConnection().prepareStatement(sql);
            
            stmt.setString(1, enunciado);
            stmt.setString(2, tipo);
            stmt.setString(3, tema);
            stmt.setInt(4, 1);
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao inserir na tabela questoes!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na tabela questoes!");
        }
    }
    
    private static int getLastId(String coluna, String tabela){
        String sql = "SELECT max(" + coluna + ")'id' FROM " + tabela;
        int id = 0;
        
        try {
            PreparedStatement stmt = SqlConn.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt(1);
            }
            stmt.close();
            rs.close();
            return id;
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    private static void setEmAlternativa1(String alternativa1, JCheckBox mark1, int foreignKey){
        String sql = "INSERT INTO alternativa1(texto, esta_correta, fk_questao) VALUES(?, ?, ?)";
        
        try {
            PreparedStatement stmt = SqlConn.getConnection().prepareStatement(sql);
            
            stmt.setString(1, alternativa1);
            if(mark1.isSelected() == true)
                stmt.setString(2, "sim");
            else
                stmt.setString(2, "nao");
            stmt.setInt(3, foreignKey);
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao inserir na tabela multipla_escolha!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na tabela multipla_escolha!");
        }
    }
    
    private static void setEmAlternativa2(String alternativa2, JCheckBox mark2, int foreignKey){
        String sql = "INSERT INTO alternativa2(texto, esta_correta, fk_questao) VALUES(?, ?, ?)";
        try {
            PreparedStatement stmt = SqlConn.getConnection().prepareStatement(sql);
            
            stmt.setString(1, alternativa2);
            if(mark2.isSelected() == true)
                stmt.setString(2, "sim");
            else
                stmt.setString(2, "nao");
            stmt.setInt(3, foreignKey);
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao inserir na tabela multipla_escolha!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na tabela multipla_escolha");
        }
    }
    
    private static void setEmAlternativa3(String alternativa3, JCheckBox mark3, int foreignKey){
        String sql = "INSERT INTO alternativa3(texto, esta_correta, fk_questao) VALUES(?, ?, ?)";
        try {
            PreparedStatement stmt = SqlConn.getConnection().prepareStatement(sql);
            
            stmt.setString(1, alternativa3);
            if(mark3.isSelected() == true)
                stmt.setString(2, "sim");
            else
                stmt.setString(2, "nao");
            stmt.setInt(3, foreignKey);
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao inserir na tabela multipla_escolha!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na tabela multipla_escolha");
        }
    }
   
    private static void setEmAlternativa4(String alternativa4, JCheckBox mark4, int foreignKey){
        String sql = "INSERT INTO alternativa4(texto, esta_correta, fk_questao) VALUES(?, ?, ?)";
        try {
            PreparedStatement stmt = SqlConn.getConnection().prepareStatement(sql);
            
            stmt.setString(1, alternativa4);
            if(mark4.isSelected() == true)
                stmt.setString(2, "sim");
            else
                stmt.setString(2, "nao");
            stmt.setInt(3, foreignKey);
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao inserir na tabela multipla_escolha!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na tabela multipla_escolha");
        }
    }
    
    private static void setEmAlternativa5(String alternativa5, JCheckBox mark5, int foreignKey){
        String sql = "INSERT INTO alternativa5(texto, esta_correta, fk_questao) VALUES(?, ?, ?)";
        try {
            PreparedStatement stmt = SqlConn.getConnection().prepareStatement(sql);
            
            stmt.setString(1, alternativa5);
            if(mark5.isSelected() == true)
                stmt.setString(2, "sim");
            else
                stmt.setString(2, "nao");
            stmt.setInt(3, foreignKey);
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao inserir na tabela multipla_escolha!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na tabela multipla_escolha");
        }
    }
    
    public static void inserirQuestaoVF(String enunciado, String tipo, String tema,  JCheckBox mark1, JCheckBox mark2, String alternativa1, String alternativa2){
        int foreignKey = 0;
        
        try{
            setEmQuestoes(enunciado, tipo, tema);
            foreignKey = getLastId("id_questao", "questoes");
            setEmAlternativa1(alternativa1, mark1, foreignKey);
            setEmAlternativa2(alternativa2, mark2, foreignKey);
            System.out.println("Inserido no banco com sucesso!");
        }catch(Exception ex){
            System.out.println("Erro ao inserir no banco de dados!");
        }
    }
    
    private static void setEmDiscursiva(String resposta, int foreignKey){
        String sql = "INSERT INTO discursiva(texto, fk_questao) VALUES(?, ?)";      
        try {
            PreparedStatement stmt = SqlConn.getConnection().prepareStatement(sql);
            
            stmt.setString(1, resposta);
            stmt.setInt(2, foreignKey);
            stmt.execute();
            stmt.close();
            System.out.println("Sucesso ao inserir na tabela discursiva!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na tabela discursiva!");
        }
    }
    
    public static void inserirQuestaoD(String enunciado, String tipo, String tema, String resposta){
        int foreignKey = 0;
        
        try{
            setEmQuestoes(enunciado, tipo, tema);
            foreignKey = getLastId("id_questao", "questoes");
            setEmDiscursiva(resposta, foreignKey);
            System.out.println("Inserido no banco com sucesso!");
        }catch(Exception ex){
            System.out.println("Erro ao inserir no banco de dados!");
        }
    }
    
    public static void inserirEmAlternativas3(String enunciado, String tipo, String tema,  JCheckBox mark1, JCheckBox mark2, JCheckBox mark3, String alternativa1, String alternativa2, String alternativa3){
        int foreignKey = 0;
        
        try{
            setEmQuestoes(enunciado, tipo, tema);
            foreignKey = getLastId("id_questao", "questoes");
            setEmAlternativa1(alternativa1, mark1, foreignKey);
            setEmAlternativa2(alternativa2, mark2, foreignKey);
            setEmAlternativa3(alternativa3, mark3, foreignKey);
            System.out.println("Inserido no banco com sucesso!");
        }catch(Exception ex){
            System.out.println("Erro ao inserir no banco de dados!");
        }
    }

    public static void inserirEmAlternativas4(String enunciado, String tipo, String tema,  JCheckBox mark1, JCheckBox mark2, JCheckBox mark3, JCheckBox mark4,  String alternativa1, String alternativa2, String alternativa3, String alternativa4){
        int foreignKey = 0;
        
        try{
            setEmQuestoes(enunciado, tipo, tema);
            foreignKey = getLastId("id_questao", "questoes");
            setEmAlternativa1(alternativa1, mark1, foreignKey);
            setEmAlternativa2(alternativa2, mark2, foreignKey);
            setEmAlternativa3(alternativa3, mark3, foreignKey);
            setEmAlternativa4(alternativa4, mark4, foreignKey);
            System.out.println("Inserido no banco com sucesso!");
        }catch(Exception ex){
            System.out.println("Erro ao inserir no banco de dados!");
        }
    }
      
     public static void inserirEmAlternativas5(String enunciado, String tipo, String tema,  JCheckBox mark1, JCheckBox mark2, JCheckBox mark3, JCheckBox mark4, JCheckBox mark5, String alternativa1, String alternativa2, String alternativa3, String alternativa4, String alternativa5){
        int foreignKey = 0;
        
        try{
            setEmQuestoes(enunciado, tipo, tema);
            foreignKey = getLastId("id_questao", "questoes");
            setEmAlternativa1(alternativa1, mark1, foreignKey);
            setEmAlternativa2(alternativa2, mark2, foreignKey);
            setEmAlternativa3(alternativa3, mark3, foreignKey);
            setEmAlternativa4(alternativa4, mark4, foreignKey);
            setEmAlternativa5(alternativa5, mark5, foreignKey);
            System.out.println("Inserido no banco com sucesso!");
        }catch(Exception ex){
            System.out.println("Erro ao inserir no banco de dados!");
        }
    }
     
    public static ArrayList<String> getTemas(){
         ArrayList<String> temas = new ArrayList();
         String sql = "SELECT tema FROM questoes";
        
        try {
            PreparedStatement stmt = SqlConn.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                temas.add(rs.getString("tema"));
            }
            
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao pegar temas!");
        }
         
         return temas;
     }
     
     public static ArrayList<String> getDisciplinas(){
         ArrayList<String> disciplinas = new ArrayList();
         String sql = "SELECT nome FROM disciplina";
        
        try {
            PreparedStatement stmt = SqlConn.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                disciplinas.add(rs.getString("nome"));
            }
            
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao pegar disciplinas!");
        }
         
         return disciplinas;
     }
}
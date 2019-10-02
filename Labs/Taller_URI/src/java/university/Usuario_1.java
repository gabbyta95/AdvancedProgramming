/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DANIELAROSERO
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario_1.findAll", query = "SELECT u FROM Usuario_1 u")
    , @NamedQuery(name = "Usuario_1.findByIdUsuario", query = "SELECT u FROM Usuario_1 u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuario_1.findByNombreUsuario", query = "SELECT u FROM Usuario_1 u WHERE u.nombreUsuario = :nombreUsuario")
    , @NamedQuery(name = "Usuario_1.findByPassword", query = "SELECT u FROM Usuario_1 u WHERE u.password = :password")
    , @NamedQuery(name = "Usuario_1.findByPermisos", query = "SELECT u FROM Usuario_1 u WHERE u.permisos = :permisos")})
public class Usuario_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdUsuario")
    private String idUsuario;
    @Basic(optional = false)
    @Column(name = "NombreUsuario")
    private String nombreUsuario;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "permisos")
    private String permisos;

    public Usuario_1() {
    }

    public Usuario_1(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario_1(String idUsuario, String nombreUsuario, String password, String permisos) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.permisos = permisos;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario_1)) {
            return false;
        }
        Usuario_1 other = (Usuario_1) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "university.Usuario_1[ idUsuario=" + idUsuario + " ]";
    }
    
}

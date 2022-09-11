/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author User
 */
public class PROVEEDORES {
    private Integer idProvedor;
    private String proNombres;
    private String proApellidos;
    private String proRuc;
    private String proCorreo;
    private String proTelefono;
    private String proDireccion;

    public PROVEEDORES(Integer idProvedor, String proNombres, String proApellidos, String proRuc, String proCorreo, String proTelefono, String proDireccion) {
        this.idProvedor = idProvedor;
        this.proNombres = proNombres;
        this.proApellidos = proApellidos;
        this.proRuc = proRuc;
        this.proCorreo = proCorreo;
        this.proTelefono = proTelefono;
        this.proDireccion = proDireccion;
    }

    public PROVEEDORES(String proNombres, String proApellidos, String proRuc, String proCorreo, String proTelefono, String proDireccion) {
        this.proNombres = proNombres;
        this.proApellidos = proApellidos;
        this.proRuc = proRuc;
        this.proCorreo = proCorreo;
        this.proTelefono = proTelefono;
        this.proDireccion = proDireccion;
    }

     public PROVEEDORES() {
    }

    public Integer getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(Integer idProvedor) {
        this.idProvedor = idProvedor;
    }

    public String getProNombres() {
        return proNombres;
    }

    public void setProNombres(String proNombres) {
        this.proNombres = proNombres;
    }

    public String getProApellidos() {
        return proApellidos;
    }

    public void setProApellidos(String proApellidos) {
        this.proApellidos = proApellidos;
    }

    public String getProRuc() {
        return proRuc;
    }

    public void setProRuc(String proRuc) {
        this.proRuc = proRuc;
    }

    public String getProCorreo() {
        return proCorreo;
    }

    public void setProCorreo(String proCorreo) {
        this.proCorreo = proCorreo;
    }

    public String getProTelefono() {
        return proTelefono;
    }

    public void setProTelefono(String proTelefono) {
        this.proTelefono = proTelefono;
    }

    public String getProDireccion() {
        return proDireccion;
    }

    public void setProDireccion(String proDireccion) {
        this.proDireccion = proDireccion;
    }


    }



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliculas.sessionbeans;

import com.peliculas.entities.Points;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author csacanam
 */
@Stateless
public class PointsFacade extends AbstractFacade<Points>
{

    @PersistenceContext(unitName = "PeliculasEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager()
    {
        return em;
    }

    public PointsFacade()
    {
        super(Points.class);
    }

}

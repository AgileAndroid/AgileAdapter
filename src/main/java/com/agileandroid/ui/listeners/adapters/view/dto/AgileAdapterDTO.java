package com.agileandroid.ui.listeners.adapters.view.dto;


import com.agileandroid.ui.listeners.adapters.view.interactor.Interactor;
import com.agileandroid.ui.listeners.adapters.view.populator.Populator;
import com.agileandroid.ui.listeners.adapters.view.resolver.ViewResolver;

/**
 * Created by oscar.urbina on 8/28/15.
 */
public class AgileAdapterDTO {

    private Populator populator;
    private ViewResolver viewResolver;
    private Interactor interactor;

    /**
     * Instantiates a new Agile adapter dTO.
     *
     * @param viewResolver the view resolver
     * @param populator    the populator
     */
    public AgileAdapterDTO(ViewResolver viewResolver, Populator populator) {
        this.populator = populator;
        this.viewResolver = viewResolver;
    }

    /**
     * Instantiates a new Agile adapter dTO.
     *
     * @param viewResolver the view resolver
     * @param populator    the populator
     * @param interactor   the interactor
     */
    public AgileAdapterDTO(ViewResolver viewResolver, Populator populator, Interactor interactor) {

        this.populator = populator;
        this.viewResolver = viewResolver;
        this.interactor = interactor;
    }

    /**
     * Gets populator.
     *
     * @return the populator
     */
    public Populator getPopulator() {
        return populator;
    }

    /**
     * Gets recycler view resolver.
     *
     * @return the recycler view resolver
     */
    public ViewResolver getViewResolver() {
        return this.viewResolver;
    }

    /**
     * Gets interactor.
     *
     * @return the interactor
     */
    public Interactor getInteractor() {
        return interactor;
    }
}

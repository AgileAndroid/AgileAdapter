package com.agileandroid.ui.listeners.adapters.view.populator;

import com.agileandroid.ui.listeners.adapters.recycler.builder.AgileRecyclerBuilder;

/**
 * Created by oscar.urbina on 9/2/15.
 */
public abstract class Populator {

    /**
     * Populate current view.
     */
    public abstract void populate(final AgileRecyclerBuilder agileRecyclerBuilder);
}

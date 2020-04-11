// Written by Jürgen Moßgraber - mossgrabers.de
// (c) 2017-2020
// Licensed under LGPLv3 - http://www.gnu.org/licenses/lgpl-3.0.txt

package de.mossgrabers.framework.command.core;

import de.mossgrabers.framework.utils.ButtonEvent;


/**
 * The No Operation command. Does nothing.
 *
 * @author J&uuml;rgen Mo&szlig;graber
 */
public class NopCommand implements TriggerCommand, ContinuousCommand
{
    /** The singleton. */
    public static final NopCommand INSTANCE = new NopCommand ();


    /**
     * Constructor.
     */
    private NopCommand ()
    {
        // Intentionally empty
    }


    /** {@inheritDoc} */
    @Override
    public void execute (final ButtonEvent event, final int velocity)
    {
        // Intentionally empty
    }


    /** {@inheritDoc} */
    @Override
    public void execute (int value)
    {
        // Intentionally empty
    }
}

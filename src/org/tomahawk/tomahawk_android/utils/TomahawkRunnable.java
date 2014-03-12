/* == This file is part of Tomahawk Player - <http://tomahawk-player.org> ===
 *
 *   Copyright 2014, Enno Gottschalk <mrmaffen@googlemail.com>
 *
 *   Tomahawk is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Tomahawk is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Tomahawk. If not, see <http://www.gnu.org/licenses/>.
 */
package org.tomahawk.tomahawk_android.utils;

public abstract class TomahawkRunnable implements Runnable, Comparable<TomahawkRunnable> {

    public static final int PRIORITY_IS_CANCELLING = 100;

    public static final int PRIORITY_IS_HIGH = 90;

    public static final int PRIORITY_IS_LOW = 80;

    public static final int PRIORITY_IS_REPORTING = 20;

    public static final int PRIORITY_IS_AUTHENTICATING = 10;

    public static final int PRIORITY_IS_RESOLVING = 5;

    public static final int PRIORITY_IS_REPORTING_WITH_HEADERREQUEST = 0;

    private int mPriority = PRIORITY_IS_RESOLVING;

    public TomahawkRunnable(int priority) {
        mPriority = priority;
    }

    public int getPriority() {
        return mPriority;
    }

    @Override
    public int compareTo(TomahawkRunnable other) {
        return other.getPriority() - mPriority;
    }
}
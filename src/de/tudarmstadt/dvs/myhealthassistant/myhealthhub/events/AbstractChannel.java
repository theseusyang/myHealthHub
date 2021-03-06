/* 
 * Copyright (C) 2014 TU Darmstadt, Hessen, Germany.
 * Department of Computer Science Databases and Distributed Systems
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */ 
 
 /**
 * 
 */
package de.tudarmstadt.dvs.myhealthassistant.myhealthhub.events;

/**
 * @author Christian Seeger
 *
 */
public abstract class AbstractChannel {
	public static String MY_HEALTH_HUB_PACKAGE_NAME = "de.tudarmstadt.dvs.myhealthassistant.myhealthhub";
	public static String RECEIVER = "de.tudarmstadt.dvs.myhealthassistant.eventreceiver";
	public static String NOTIFICATION = "de.tudarmstadt.dvs.myhealthassistant.notification";
	public static String MANAGEMENT = "de.tudarmstadt.dvs.myhealthassistant.management";
	public static String LOCAL_MANAGEMENT = "de.tudarmstadt.dvs.myhealthassistant.local_management";
}
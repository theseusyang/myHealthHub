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
 
 package de.tudarmstadt.dvs.myhealthassistant.myhealthhub.events.sensorreadings.cardiovascular;

import de.tudarmstadt.dvs.myhealthassistant.myhealthhub.events.sensorreadings.SensorReadingEvent;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Christian Seeger
 *
 */
public class BloodPressureEvent extends SensorReadingEvent {

	public static String EVENT_TYPE = SensorReadingEvent.BLOOD_PRESSURE;
	
	private String unit;
	private int systolic;
	private int diastolic;
	private int pulse;


	/**
	 * Creates an blood pressure measurement event.
	 * @param eventID Event ID.
	 * @param timestamp Timestamp of event.
	 * @param producerID ID of event producer.
	 * @param sensorType Sensor type of event producer.
	 * @param timeOfMeasurement Time of measurement.
	 */
	public BloodPressureEvent(String eventID, 
			String timestamp, String producerID, String sensorType,
			String timeOfMeasurement) {
		super(EVENT_TYPE, eventID, timestamp, 
				producerID, sensorType,timeOfMeasurement);
	}
	
	/**
	 * Creates an blood pressure measurement event.
	 * @param eventID Event ID.
	 * @param timestamp Timestamp of event.
	 * @param producerID ID of event producer.
	 * @param sensorType Sensor type of event producer.
	 * @param timeOfMeasurement Time of measurement.
	 * @param mySystolic Systolic blood pressure value.
	 * @param myDiastolic Diastolic blood pressure value.
	 * @param myPulse Pulse value.
	 * @param myUnit Unit of blood pressure measurement.
	 */
	public BloodPressureEvent(String eventID, 
			String timestamp, String producerID, String sensorType,
			String timeOfMeasurement,
			int mySystolic, int myDiastolic, int myPulse, 
			String myUnit) {
		this(eventID, timestamp, 
				producerID, sensorType,timeOfMeasurement);
		systolic = mySystolic;
		diastolic = myDiastolic;
		pulse = myPulse;
		unit = myUnit;		
	}
	
	
	/**
	 * @return Unit of blood pressure measurement.
	 */
	public String getUnit() {
		return unit;
	}

	
	/**
	 * @return Systolic value
	 */
	public int getSystolic() {
		return systolic;
	}

	
	/**
	 * @return Diastolic value
	 */
	public int getDiastolic() {
		return diastolic;
	}

	
	/**
	 * @return Pulse value
	 */
	public int getPulse() {
		return pulse;
	}
	
	
	@Override
	public int describeContents() {
		return 0;
	}

	public static final Parcelable.Creator<BloodPressureEvent> CREATOR =
		new Parcelable.Creator<BloodPressureEvent>() {

			@Override
			public BloodPressureEvent createFromParcel(Parcel source) {
				return new BloodPressureEvent(source);
			}

			@Override
			public BloodPressureEvent[] newArray(int size) {
				return new BloodPressureEvent[size];
			}		
		};

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(eventType);
		dest.writeString(eventID);
		dest.writeString(timestamp);
		dest.writeString(producerID);
		dest.writeString(sensorType);
		dest.writeString(timeOfMeasurement);		
		dest.writeInt(diastolic);
		dest.writeInt(systolic);
		dest.writeInt(pulse);
		dest.writeString(unit);
	}
	
	private BloodPressureEvent(final Parcel source) {
		super(source.readString(), source.readString(), 
				source.readString(),source.readString(),
				source.readString(),source.readString());
		readFromParcel(source);		
	}
	
	public void readFromParcel(final Parcel source) {
		diastolic = source.readInt();
		systolic = source.readInt();
		pulse = source.readInt();
		unit = source.readString();
	}
}
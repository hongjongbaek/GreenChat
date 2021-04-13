package kr.co.greenart;

public class Room {
	private int room_num;
	private String room_name;
	private String room_preoplenum;
	private String room_password;
	private String room_master;
	
	public Room(String room_name, String room_preoplenum, String room_password, String room_master) {
		super();
		this.room_num = room_num;
		this.room_name = room_name;
		this.room_preoplenum = room_preoplenum;
		this.room_password = room_password;
		this.room_master = room_master;
	}

	public synchronized int getRoom_num() {
		return room_num;
	}

	public synchronized void setRoom_num(int room_num) {
		this.room_num = room_num;
	}

	public synchronized String getRoom_name() {
		return room_name;
	}

	public synchronized void setRoom_name(String room_name) {
		this.room_name = room_name;
	}

	public synchronized String getRoom_preoplenum() {
		return room_preoplenum;
	}

	public synchronized void setRoom_preoplenum(String room_preoplenum) {
		this.room_preoplenum = room_preoplenum;
	}

	public synchronized String getRoom_password() {
		return room_password;
	}

	public synchronized void setRoom_password(String room_password) {
		this.room_password = room_password;
	}

	public synchronized String getRoom_master() {
		return room_master;
	}

	public synchronized void setRoom_master(String room_master) {
		this.room_master = room_master;
	}

	@Override
	public String toString() {
		return "Room [room_num=" + room_num + ", room_name=" + room_name + ", room_preoplenum=" + room_preoplenum
				+ ", room_password=" + room_password + ", room_master=" + room_master + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((room_master == null) ? 0 : room_master.hashCode());
		result = prime * result + ((room_name == null) ? 0 : room_name.hashCode());
		result = prime * result + room_num;
		result = prime * result + ((room_password == null) ? 0 : room_password.hashCode());
		result = prime * result + ((room_preoplenum == null) ? 0 : room_preoplenum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (room_master == null) {
			if (other.room_master != null)
				return false;
		} else if (!room_master.equals(other.room_master))
			return false;
		if (room_name == null) {
			if (other.room_name != null)
				return false;
		} else if (!room_name.equals(other.room_name))
			return false;
		if (room_num != other.room_num)
			return false;
		if (room_password == null) {
			if (other.room_password != null)
				return false;
		} else if (!room_password.equals(other.room_password))
			return false;
		if (room_preoplenum == null) {
			if (other.room_preoplenum != null)
				return false;
		} else if (!room_preoplenum.equals(other.room_preoplenum))
			return false;
		return true;
	}
}

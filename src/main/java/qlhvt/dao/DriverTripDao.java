package qlhvt.dao;

import java.util.List;

import qlhvt.entities.DriverTrip;

public interface DriverTripDao {
	List<DriverTrip> getAllDriverTrip();

	DriverTrip getDriverTripById(Integer id);

	void addDriverTrip(DriverTrip driverTrip);

	void updateDriverTrip(DriverTrip driverTrip);

	void deleteDriverTripById(Integer id);

	List<DriverTrip> searchDriverTripByCondition(int page, int pageSize, String columnSortName, Boolean asc,
			Integer driverType);

	int getRowCount(Integer driverType);
}

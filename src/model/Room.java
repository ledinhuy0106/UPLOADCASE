package model;

import java.io.Serializable;

public class Room implements Serializable {
    private int roomId;
    private double price;
    private boolean status;
    private int numberOfBedroom;
    private  int numberOfToilet;

    public Room() {}
    public Room(int roomId, double price, boolean status, int numberOfBedroom, int numberOfToilet) {
        this.roomId = roomId;
        this.price = price;
        this.status = status;
        this.numberOfBedroom = numberOfBedroom;
        this.numberOfToilet = numberOfToilet;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public boolean setStatus(boolean status) {
        this.status = status;
        return status;
    }

    public int getNumberOfBedroom() {
        return numberOfBedroom;
    }

    public void setNumberOfBedroom(int numberOfBedroom) {
        this.numberOfBedroom = numberOfBedroom;
    }

    public int getNumberOfToilet() {
        return numberOfToilet;
    }

    public void setNumberOfToilet(int numberOfToilet) {
        this.numberOfToilet = numberOfToilet;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", price=" + price +
                ", status=" + status +
                ", numberOfBedroom=" + numberOfBedroom +
                ", numberOfToilet=" + numberOfToilet +
                '}';
    }
}

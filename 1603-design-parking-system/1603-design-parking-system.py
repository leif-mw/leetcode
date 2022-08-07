class ParkingSystem:

    def __init__(self, big: int, medium: int, small: int):
        self.b = big
        self.m = medium
        self.s = small

    def addCar(self, carType: int) -> bool:
        match carType:
            case 1:
                if self.b:
                    self.b -= 1
                    return True
                return False
            case 2:
                if self.m:
                    self.m -= 1
                    return True
                return False
            case 3:
                if self.s:
                    self.s -=1
                    return True
                return False
        
# Your ParkingSystem object will be instantiated and called as such:
# obj = ParkingSystem(big, medium, small)
# param_1 = obj.addCar(carType)
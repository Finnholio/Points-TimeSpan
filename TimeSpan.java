public class TimeSpan{
  int hours;
  int minutes;

  public TimeSpan(int hours, int minutes) {
    calculateNewTimeSpan(hours, minutes);
  }

  public void calculateNewTimeSpan(int hours, int minutes){
    if (hours < 0 || minutes < 0) {
      throw new IllegalArgumentException();
    }
    this.hours = hours + minutes / 60;
    this.minutes = minutes % 60;
  }

  public void add(TimeSpan span){
    int newHours = hours + span.hours;
    int newMinutes = minutes + span.minutes;

    calculateNewTimeSpan(newHours, newMinutes);
  }

  public void subtract(TimeSpan span){
    int newHours = hours - span.hours;
    int newMinutes = minutes - span.minutes;

    calculateNewTimeSpan(newHours, newMinutes);
  }

  public void scale(int factor){
    int newHours = hours * factor;
    int newMinutes = minutes * factor;

    calculateNewTimeSpan(newHours, newMinutes);
  }


}


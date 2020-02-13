// The IncDate class
// Do not make changes to anything other than the body of increment() method
// Carlos J Degollado

public class IncDate extends Date
{
    // copy constructor
    public IncDate(Date o)
    {
        super(o.m_month, o.m_day, o.m_year);
    }

    // constructor
    public IncDate(int month, int day, int year)
    {
        super(month, day, year);
    }

    public void addDays(int numDays)
    {
        //increment loop
        do {
            //leap year identifier
            boolean isLeap = false;

            if (m_year % 4 == 0) {
                if (m_year % 100 == 0) {
                    if (m_year % 400 == 0) {
                        isLeap = true;
                    }
                } else {
                    isLeap = true;
                }
            }

            //month day-count
            int month;
            if (m_month == 1 || m_month == 3 || m_month == 5 || m_month == 7 || m_month == 8 ||
                    m_month == 10 || m_month == 12) {
                month = 31;
            } else if (m_month == 4 || m_month == 6 || m_month == 9 || m_month == 11) {
                month = 30;
            } else {
                if (isLeap) {
                    month = 29;
                } else {
                    month = 28;
                }
            }

            //increment day
              if (m_day < month) {
                  m_day++;
              } else {
                  if (m_month < 12) {
                      m_month++;
                      month++;
                      m_day = 1;
                  } else {
                      m_year++;
                      m_month = 1;
                      m_day = 1;
                      month = 1;
                  }
              }
            numDays--;

        } while (numDays != 0);
    }
}

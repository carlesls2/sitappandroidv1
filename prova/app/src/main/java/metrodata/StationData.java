
package metrodata;

import android.graphics.Color;
import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StationData
{
    /**
     * connections are the lines connected
     */
    List<String> connections;
    List<Color> colors;
    List<GSM> gsm;
    List<COOR> coor;
}

/**
*information regarding GSM data
 */
class GSM
{
    COOR coor;
    /**
     * id of the cell.
     */
    int cellid;
}

/**
 * coordinates of the entries
 * and the "area"
 */
class COOR
{

}

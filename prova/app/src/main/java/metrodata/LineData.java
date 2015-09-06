package metrodata;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by carle_000 on 05/09/2015.
 */
public class LineData implements List<StationData>
{
    /**
     * this displays the last and first station.
     */
    String end1,end2;
    /**
     * name of the line idem L1,...L11,...
     */
    String name;

    @Override
    public void add(int location, StationData object)     {    }

    @Override
    public boolean addAll(Collection<? extends StationData> collection) {
        return false;
    }

    @Override
    public boolean addAll(int location, Collection<? extends StationData> collection) {      return false;    }

    @Override
    public boolean equals(Object object) {
        return false;
    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public boolean isEmpty() {                return false;    }

    @Override
    public StationData set(int location, StationData object) {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public void clear() {    }

    @NonNull
    @Override
    public Iterator<StationData> iterator() {
        return null;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public StationData remove(int location) {
        return null;
    }

    @Override
    public boolean remove(Object object) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @NonNull
    @Override
    public Object[] toArray()    {        return new Object[0];    }

    @NonNull
    @Override
    public <T> T[] toArray(T[] array) {
        return null;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }


    @Override
    public StationData get(int location)
    {
        return null;
    }

    @Override
    public boolean add(StationData object)
    {
        return false;
    }

    @Override
    public ListIterator<StationData> listIterator()
    {
        return null;
    }

    @NonNull
    @Override
    public ListIterator<StationData> listIterator(int location)
    {
        return null;
    }

    @NonNull
    @Override
    public List<StationData> subList(int start, int end)
    {
        return null;
    }
    public void initializeAux()
    {

    }
}

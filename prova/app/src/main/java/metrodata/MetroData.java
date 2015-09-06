package metrodata;

import android.support.v7.internal.view.menu.ListMenuPresenter;


import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/**
 * Created by carle_000 on 06/09/2015.
 */
class MetroData implements List<LineData>
{
    @Override
    public LineData remove(int location) {
        return null;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean remove(Object object) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @NonNull
    @Override
    public List<LineData> subList(int start, int end) {
        return null;
    }

    @NonNull
    @Override
    public ListIterator<LineData> listIterator(int location) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @NonNull
    @Override
    public Iterator<LineData> iterator() {
        return null;
    }

    @Override
    public boolean add(LineData object) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void add(int location, LineData object) {

    }

    @Override
    public LineData set(int location, LineData object) {
        return null;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @NonNull
    @Override
    public <T> T[] toArray(T[] array) {
        return null;
    }

    @Override
    public ListIterator<LineData> listIterator() {
        return null;
    }

    @Override
    public boolean addAll(int location, Collection<? extends LineData> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends LineData> collection) {
        return false;
    }

    @Override
    public LineData get(int location) {
        return null;
    }

    @Override
    public void clear() {

    }
}

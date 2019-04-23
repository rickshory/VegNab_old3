package com.rickshory.vegnab.repositories

annotation class Specification(val what: String)

interface Repository<T> {
    fun add(item: T)

    fun add(items: Iterable<T>)

    fun update(item: T)

    fun remove(item: T)

    fun remove(specification: Specification)

    fun query(specification: Specification): List<T>
}
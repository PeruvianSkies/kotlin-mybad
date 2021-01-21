package org.tian.putra.heroku.container.repository

import org.tian.putra.heroku.container.domain.Barang
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.Description
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "barang", path = "barang", collectionResourceDescription = Description("API Barang"))
interface BarangRepostory : PagingAndSortingRepository<Barang, String>